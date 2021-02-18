package com.springsample.controller;

import com.springsample.model.Member;
import com.springsample.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Spring controllers contain handles for HTTP requests.
 * By defining this as a 'RestController', it will only handle REST API requests.
 */
@RestController
public class MemberController {
    /** @see MemberRepository */
    MemberRepository repository;

    /**
     * The Spring framework is really nice in how it does everything for you.
     *
     * By simply defining a constructor for this controller, and by having the repository as the parameter, when
     * 'SpringApplication::run' is called (in com.springsample.Application), it will automatically construct a
     * Singleton instance of this controller, as well as the repository.
     *
     * These singleton instances are referred to as "beans".
     */
    public MemberController(MemberRepository repository) {
        this.repository = repository;
    }

    /**
     * 'GetMapping' tells the controller to map any GET requests from '/members/get/name={name}' to
     * our 'getByName()' method.
     * 'PathVariable' specifies that there's a variable in the URL path called 'name', and so the paramter 'name'
     * stores that value.
     *
     * @param name - Name of the member.
     * @return The list of members that match the name 'name'.
     */
    @GetMapping("/members/get/name={name}")
    List<Member> getByName(@PathVariable String name) {
        return repository.getByName(name);
    }

    /**
     * Same as above, but now we're getting members by school.
     * @param school - School the member goes to.
     * @return The list of members that go to the school 'school'.
     */
    @GetMapping("/members/get/school={school}")
    List<Member> getBySchool(@PathVariable String school) {
        return repository.getBySchool(school);
    }

    /**
     * 'PutMapping' tells the controller to map any PUT requests for '/members/add' to our 'add()' method.
     * 'RequestBody' tells Spring that the body of the PUT request contains a data model that represents a
     * Member object. The member object is serialized into a Java object and stored in the parameter 'member'.
     *
     * @param member - The member to add to our repository.
     * @return The same member passed by the request.
     */
    @PutMapping("/members/add")
    Member add(@RequestBody Member member) {
        return repository.add(member);
    }

    /**
     * 'DeleteMapping' tells the controller to map any DELETE requests for '/members/remove/name={name}' to
     * our 'removeByName()' method.
     *
     * @param name - Name of the member.
     * @return A list of members with name 'name' that were removed from the repository.
     */
    @DeleteMapping("/members/remove/name={name}")
    List<Member> removeByName(@PathVariable String name) {
        return repository.removeByName(name);
    }
}

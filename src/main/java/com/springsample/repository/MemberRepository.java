package com.springsample.repository;

import com.springsample.model.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * We use a repository as the interface for retrieving/submitting data. This is where all the database interactions
 * will happen so they aren't cluttered in the controllers.
 *
 * This specific repository will hold our "database" of members, as well as an interface for accessing and modifying
 * the "database".
 */
@Repository
public class MemberRepository {
    List<Member> members;

    public MemberRepository(List<Member> members) {
        this.members = members;
    }

    public List<Member> getByName(String name) {
        return members.parallelStream()
                .filter(member -> member.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<Member> getBySchool(String school) {
        return members.parallelStream()
                .filter(member -> member.getSchool().equals(school))
                .collect(Collectors.toList());
    }

    public Member add(Member member) {
        this.members.add(member);
        return member;
    }

    public List<Member> removeByName(String name) {
        List<Member> membersToRemove = members.parallelStream()
                .filter(member -> member.getName().equals(name))
                .collect(Collectors.toList());
        members.removeAll(membersToRemove);
        return membersToRemove;
    }
}

for name in Jacob Callan Calvin Milica Quentin Brian; do
    curl -X PUT localhost:8080/members/add -H 'Content-Type:application/json' -d "{ \"name\": \"${name}\", \"school\": \"UW-Madison\" }"
    echo ''
done

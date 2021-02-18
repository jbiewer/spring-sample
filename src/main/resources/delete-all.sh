for name in Jacob Callan Calvin Milica Quentin Brian; do
    curl -X DELETE localhost:8080/members/remove/name=${name}
    echo ''
done

name="Jacob"
if [ ! -z $1 ]; then
    name=$1
fi

curl -v localhost:8080/members/get/name="${name}"
echo

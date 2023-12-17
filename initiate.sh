
#!/usr/bin/env sh

if [ -z $1 ]; then
  echo "Please enter what you want to replace"
  exit 1;
fi

set -e
read -p "Enter the repo name: " word
echo "You entered $word"

grep -rl --exclude=\*.md  -I $1 ./ | xargs sed -i '' 's/'$1'/'$word'/g'
mv "api/src/main/kotlin/com/cogoport/$1" "api/src/main/kotlin/com/cogoport/$word"
mv "api/src/test/kotlin/com/cogoport/$1" "api/src/test/kotlin/com/cogoport/$word"
mv "client/src/main/kotlin/com/cogoport/$1" "client/src/main/kotlin/com/cogoport/$word"
mv "model/src/main/kotlin/com/cogoport/$1" "model/src/main/kotlin/com/cogoport/$word"
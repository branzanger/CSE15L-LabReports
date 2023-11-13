
if [[ -f $1 ]]
then
  echo "found it with -f!"
fi

if [[ -e $1 ]]
then
  echo "found it with -e!"
fi

if [[ -d $1 ]]
then
  echo "found it with -d!"
fi

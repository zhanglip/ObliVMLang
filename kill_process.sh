for i in 11832 12208 12306 12354 12552 14036 15593 16118 17844
do
    sudo kill -9 $(netstat -anp | grep :$i | awk '{print $7}' | awk -F"/" '{ print $1 }')
done
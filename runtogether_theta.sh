#java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i $2 --config countConfig.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
#java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i $1 --config countConfig.conf -c com.oblivm.backend.generated.thetaJoin.NoClass

L1_size=33
L2_size=33
L3_size=33

R1_size=23
R2_size=22
R3_size=23

for i in $(seq 0 `expr ${L1_size} - 1`) 
do  
    for j in $(seq 0 `expr ${R2_size} - 1`) 
    do
        echo $i;
        echo $j;
        java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i examples/join/thetaJoin/L1_${i}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
        java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i examples/join/thetaJoin/R2_${j}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass
    done
    ps -ef | grep examples/join/thetaJoin | grep -v grep | cut -c 9-15 | xargs kill -9
done


# for i in $(seq 0 `expr ${L1_size} - 1`) 
# do  
#     for j in $(seq 0 `expr ${R3_size} - 1`) 
#     do
#     echo $i;
#         echo $j;
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i examples/join/thetaJoin/L1_${i}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i examples/join/thetaJoin/R3_${j}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass
#     done
#     ps -ef | grep examples/join/thetaJoin | grep -v grep | cut -c 9-15 | xargs kill -9
# done


# for i in $(seq 0 `expr ${L2_size} - 1`) 
# do  
#     for j in $(seq 0 `expr ${R1_size} - 1`) 
#     do
#     echo $i;
#         echo $j;
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i examples/join/thetaJoin/L2_${i}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i examples/join/thetaJoin/R1_${j}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass
#     done
#     ps -ef | grep examples/join/thetaJoin | grep -v grep | cut -c 9-15 | xargs kill -9
# done


# for i in $(seq 0 `expr ${L2_size} - 1`) 
# do  
#     for j in $(seq 0 `expr ${R3_size} - 1`) 
#     do
#     echo $i;
#         echo $j;
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i examples/join/thetaJoin/L2_${i}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i examples/join/thetaJoin/R3_${j}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass
#     done
#     ps -ef | grep examples/join/thetaJoin | grep -v grep | cut -c 9-15 | xargs kill -9
# done


# for i in $(seq 0 `expr ${L3_size} - 1`) 
# do  
#     for j in $(seq 0 `expr ${R1_size} - 1`) 
#     do
#     echo $i;
#         echo $j;
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i examples/join/thetaJoin/L3_${i}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i examples/join/thetaJoin/R1_${j}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass
#     done
#     ps -ef | grep examples/join/thetaJoin | grep -v grep | cut -c 9-15 | xargs kill -9
# done


# for i in $(seq 0 `expr ${L3_size} - 1`) 
# do  
#     for j in $(seq 0 `expr ${R2_size} - 1`) 
#     do
#     echo "---last: "$i;
#         echo $j;
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t eva -i examples/join/thetaJoin/L3_${i}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass &
# java -cp to-run:lib/* com.oblivm.backend.lang.inter.Cmd -t gen -i examples/join/thetaJoin/R2_${j}_bin.txt --config /home/zhanglipeng/ObliVMLang1/config/countConfig_11832.conf -c com.oblivm.backend.generated.thetaJoin.NoClass
#     done
#     ps -ef | grep examples/join/thetaJoin | grep -v grep | cut -c 9-15 | xargs kill -9
# done


wait
echo "finished"
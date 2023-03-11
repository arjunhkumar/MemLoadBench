#!/bin/bash
echo "Starting test"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.NonValueMain 16000000 > nvm.log 2>&1

echo "Finished NonValue"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.ValueMain 16000000 > vm.log 2>&1

echo "Finished Value1x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.ValueMain2x 16000000 > vm2x.log 2>&1

echo "Finished ValueMain2x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.ValueMain3x 16000000 > vm3x.log 2>&1

echo "Finished ValueMain3x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.ValueMain4x 16000000 > vm4x.log 2>&1

echo "Finished ValueMain4x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.ValueMain8x 16000000 > vm8x.log 2>&1

echo "Finished ValueMain8x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xms4G -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.ValueMain16x 16000000 > vm16x.log 2>&1

echo "Finished ValueMain16x"

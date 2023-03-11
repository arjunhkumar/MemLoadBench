#!/bin/bash
echo "Starting test"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xmx12G  -Xverify:none -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar in.ac.iitmandi.compl.suite.NonValueMain 32000000 > nvm.log 2>&1

echo "Finished NonValue"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar in.ac.iitmandi.compl.suite.ValueMain 32000000 > vm.log 2>&1

echo "Finished Value1x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar in.ac.iitmandi.compl.suite.ValueMain2x 32000000 > vm2x.log 2>&1

echo "Finished ValueMain2x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar in.ac.iitmandi.compl.suite.ValueMain4x 32000000 > vm4x.log 2>&1

echo "Finished ValueMain4x"

perf stat -r 10 -e cache-misses,cache-references -d -d -d $SANITY_JDK/java -Xmx12G  -Xverify:none -XX:ValueTypeFlatteningThreshold=9999 -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar in.ac.iitmandi.compl.suite.ValueMain8x 32000000 > vm8x.log 2>&1

echo "Finished ValueMain8x"

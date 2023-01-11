perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=128 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain > vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=128 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain > vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=32 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=32 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=256 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=256 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=512 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=512 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=1024 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=1024 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=2048 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=2048 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=0 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=4096 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=4096 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=64 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1
perf stat -e cache-misses $SANITY_JDK/bin/java -Xverify:none -XX:ValueTypeFlatteningThreshold=64 -Xjit:count=1,disableAsyncCompilation -cp target/valuetypes-comparison-1.1.jar in.ac.iitmandi.compl.suite.ValueMain >> vRes.log 2>&1

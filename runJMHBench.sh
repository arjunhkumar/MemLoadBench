#!/bin/bash

echo "Starting test"

$SANITY_JDK/java -Djmh.ignoreLock=true -Xverify:none -Xjit:count=1,disableAsyncCompilation,optlevel=hot -cp valuetypes-comparison-2.1-SNAPSHOT.jar:lib/* in.ac.iitmandi.compl.suite.Harness | tee jmhLog.log 2>&1

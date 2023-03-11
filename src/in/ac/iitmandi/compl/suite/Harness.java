/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;

/**
 * @author arjun
 *
 */
@Fork(value = 2, jvmArgs = {"-Xms4G", "-Xmx12G"})
@State(Scope.Benchmark)
@Warmup(iterations = 3)
@Measurement(iterations = 2)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class Harness {

	
	public Harness() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception {
        Main.main(args);
    }
	
	@Setup(Level.Invocation)
	public void setUpBenchmark() {
		GlobalStorage.ITERSIZE = 320000;
	}
	
	@Benchmark
	@BenchmarkMode(Mode.All)
	public void runValueAnalysis(Harness mainObj, Blackhole blackhole) {
		ValueMain vmObj = new ValueMain();
		vmObj.intializeDataPoints();
		blackhole.consume(vmObj.runExperimentsWithBlackHole());
	}
	
	@Benchmark
	@BenchmarkMode(Mode.All)
	public void runNonValueAnalysis(Harness mainObj, Blackhole blackhole) {
		NonValueMain vmObj = new NonValueMain();
		vmObj.intializeDataPoints();
		blackhole.consume(vmObj.runExperimentsWithBlackHole());
	}
	
	
	@Benchmark
	@BenchmarkMode(Mode.All)
	public void runValue4xAnalysis(Harness mainObj, Blackhole blackhole) {
		ValueMain4x vmObj = new ValueMain4x();
		vmObj.intializeDataPoints();
		blackhole.consume(vmObj.runExperimentsWithBlackHole());
	}
	
	@Benchmark
	@BenchmarkMode(Mode.All)
	public void runValue8xAnalysis(Harness mainObj, Blackhole blackhole) {
		ValueMain8x vmObj = new ValueMain8x();
		vmObj.intializeDataPoints();
		blackhole.consume(vmObj.runExperimentsWithBlackHole());
	}
	
}

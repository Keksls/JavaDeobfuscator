/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Counter
 *  com.codahale.metrics.Gauge
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Meter
 *  com.codahale.metrics.MetricFilter
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.ScheduledReporter
 *  com.codahale.metrics.Timer
 *  org.yaml.snakeyaml.DumperOptions
 *  org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  org.yaml.snakeyaml.Yaml
 */
import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Timer;
import java.io.PrintStream;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

/*
 * Renamed from HC
 */
public class hc_1
extends ScheduledReporter {
    private final PrintStream a;

    public hc_1(MetricRegistry metricRegistry, PrintStream printStream, MetricFilter metricFilter, TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(metricRegistry, "yaml-reporter", metricFilter, timeUnit, timeUnit2);
        this.a = printStream;
    }

    public void report(SortedMap<String, Gauge> sortedMap, SortedMap<String, Counter> sortedMap2, SortedMap<String, Histogram> sortedMap3, SortedMap<String, Meter> sortedMap4, SortedMap<String, Timer> sortedMap5) {
        Gauge gauge;
        String string;
        hh_1 hh_12 = new hh_1();
        if (!sortedMap.isEmpty()) {
            for (Map.Entry<String, Gauge> entry2 : sortedMap.entrySet()) {
                string = entry2.getKey();
                gauge = entry2.getValue();
                hh_12.a(string, new he_1(gauge.getValue()));
            }
        }
        if (!sortedMap2.isEmpty()) {
            for (Map.Entry<String, Gauge> entry : sortedMap2.entrySet()) {
                string = entry.getKey();
                gauge = (Counter)entry.getValue();
                hh_12.a(string, new hd_1(gauge.getCount()));
            }
        }
        if (!sortedMap3.isEmpty()) {
            for (Map.Entry<String, Gauge> entry : sortedMap3.entrySet()) {
                string = entry.getKey();
                gauge = (Histogram)entry.getValue();
                hh_12.a(string, new hf_1(gauge.getCount(), gauge.getSnapshot()));
            }
        }
        if (!sortedMap4.isEmpty()) {
            for (Map.Entry entry : sortedMap4.entrySet()) {
                string = (String)entry.getKey();
                gauge = (Meter)entry.getValue();
                hh_12.a(string, new hg_1((Meter)gauge));
            }
        }
        if (!sortedMap5.isEmpty()) {
            for (Map.Entry entry : sortedMap5.entrySet()) {
                string = (String)entry.getKey();
                gauge = (Timer)entry.getValue();
                hh_12.a(string, new hi_1(this, (Timer)gauge));
            }
        }
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        dumperOptions.setAllowReadOnlyProperties(true);
        Yaml yaml = new Yaml(dumperOptions);
        this.a.println(yaml.dumpAsMap((Object)hh_12));
    }

    static /* synthetic */ double a(hc_1 hc_12, double d2) {
        return hc_12.convertRate(d2);
    }

    static /* synthetic */ String a(hc_1 hc_12) {
        return hc_12.getRateUnit();
    }

    static /* synthetic */ double b(hc_1 hc_12, double d2) {
        return hc_12.convertRate(d2);
    }

    static /* synthetic */ String b(hc_1 hc_12) {
        return hc_12.getRateUnit();
    }

    static /* synthetic */ double c(hc_1 hc_12, double d2) {
        return hc_12.convertRate(d2);
    }

    static /* synthetic */ String c(hc_1 hc_12) {
        return hc_12.getRateUnit();
    }

    static /* synthetic */ double d(hc_1 hc_12, double d2) {
        return hc_12.convertRate(d2);
    }

    static /* synthetic */ String d(hc_1 hc_12) {
        return hc_12.getRateUnit();
    }

    static /* synthetic */ double e(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String e(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double f(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String f(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double g(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String g(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double h(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String h(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double i(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String i(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double j(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String j(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double k(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String k(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double l(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String l(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double m(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String m(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }

    static /* synthetic */ double n(hc_1 hc_12, double d2) {
        return hc_12.convertDuration(d2);
    }

    static /* synthetic */ String n(hc_1 hc_12) {
        return hc_12.getDurationUnit();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Gauge
 *  com.google.gson.annotations.SerializedName
 */
import com.codahale.metrics.Gauge;
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from HJ
 */
public class hj_1
extends hl_1 {
    @SerializedName(value="type")
    private static final String a = "gauge";
    @SerializedName(value="value")
    private final Object b;

    public hj_1(String string, Gauge<?> gauge) {
        super(string);
        this.b = gauge.getValue();
    }
}


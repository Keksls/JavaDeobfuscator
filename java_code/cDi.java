/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;

public final class cDi {
    @SerializedName(value="_msg_id")
    private String a;
    @SerializedName(value="progress")
    private double b;
    @SerializedName(value="eta")
    private double c;
    @SerializedName(value="groups")
    private cDh[] d;

    public String a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public List<cDh> d() {
        return Arrays.asList(this.d);
    }
}


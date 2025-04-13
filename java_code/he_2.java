/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from He
 */
public abstract class he_2 {
    @SerializedName(value="metadata")
    protected hf_2 a;
    @SerializedName(value="service.node.name")
    private final String b = ot_2.a.a();

    protected he_2() {
    }

    public abstract String a();

    public hf_2 f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }
}


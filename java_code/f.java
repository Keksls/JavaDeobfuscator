/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class f {
    @SerializedName(value="rights")
    private final List<e> a;
    @SerializedName(value="groups")
    private final List<c> b;

    public f(List<e> list, List<c> list2) {
        this.a = list;
        this.b = list2;
    }

    public List<e> a() {
        return this.a;
    }

    public List<c> b() {
        return this.b;
    }

    public String toString() {
        return "WISERights{m_rights=" + this.a + ", m_groups=" + this.b + "}";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from emN
 */
public class emn_0 {
    @SerializedName(value="account")
    private final long a;
    @SerializedName(value="name")
    private final String b;
    @SerializedName(value="rights")
    private final List<emW> c = new ArrayList<emW>();
    @SerializedName(value="wise_rights")
    private f d;

    public emn_0(long l, String string) {
        this.a = l;
        this.b = string;
    }

    public boolean a(emW emW2) {
        try {
            boolean bl = this.c.add(emW2);
            return bl;
        }
        finally {
            this.c.sort(emT.b);
        }
    }

    public f a() {
        return this.d;
    }

    public void a(f f2) {
        this.d = f2;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public List<emW> d() {
        return Collections.unmodifiableList(this.c);
    }

    public Optional<emW> a(int n) {
        for (emW emW2 : this.c) {
            if (emW2.a() != n) continue;
            return Optional.of(emW2);
        }
        return Optional.empty();
    }

    public String toString() {
        return "Admin{m_accountId=" + this.a + ", m_adminName='" + this.b + "', m_rights=" + this.c + "}";
    }
}


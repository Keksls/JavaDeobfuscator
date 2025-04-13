/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  org.jetbrains.annotations.NotNull
 */
import com.google.gson.annotations.SerializedName;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eru
 */
public class eru_2 {
    @SerializedName(value="id")
    private int a;
    @SerializedName(value="name")
    private String b;
    @SerializedName(value="community")
    private xz_0 c;
    @SerializedName(value="servers")
    private erx_2 d;
    @SerializedName(value="single_account")
    private boolean e;
    @SerializedName(value="population")
    private xe_0 f = xe_0.a;
    private byte g;

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public xz_0 c() {
        return this.c;
    }

    public int d() {
        return this.g;
    }

    public erx_2 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public xe_0 g() {
        return this.f;
    }

    public void a(byte by) {
        this.g = by;
    }

    public byte[] h() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        byte[] byArray = Cz.a(this.b);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.c.a());
        eru_2.a(abx_22, this.d.a());
        abx_22.a(this.e);
        abx_22.a(this.f.a());
        abx_22.a(this.g);
        return abx_22.c();
    }

    private static void a(abx_2 abx_22, erw_2 erw_22) {
        byte[] byArray = Cz.a(erw_22.a());
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        int[] nArray = erw_22.b();
        abx_22.a(nArray.length);
        for (int n : nArray) {
            abx_22.a(n);
        }
    }

    public static eru_2 a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = Cz.a(byArray);
        xz_0 xz_02 = xz_0.a(byteBuffer.getInt());
        erw_2 erw_22 = eru_2.b(byteBuffer);
        boolean bl = byteBuffer.get() > 0;
        xe_0 xe_02 = xe_0.a(byteBuffer.getInt());
        byte by = byteBuffer.get();
        eru_2 eru_22 = new eru_2();
        eru_22.a = n;
        eru_22.b = string;
        eru_22.c = xz_02;
        eru_22.d = new erx_2();
        eru_22.d.a(erw_22);
        eru_22.e = bl;
        eru_22.f = xe_02;
        eru_22.g = by;
        return eru_22;
    }

    @NotNull
    private static erw_2 b(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = Cz.a(byArray);
        int[] nArray = new int[byteBuffer.getInt()];
        int n = nArray.length;
        for (int k = 0; k < n; ++k) {
            nArray[k] = byteBuffer.getInt();
        }
        erw_2 erw_22 = new erw_2();
        erw_22.a(string);
        erw_22.a(nArray);
        return erw_22;
    }

    public String toString() {
        return "Proxy{m_id=" + this.a + ", m_name='" + this.b + "', m_community=" + this.c + ", m_proxyAddresses=" + this.d + ", m_order=" + this.g + ", m_isSingleAccount= " + this.e + ", m_populationLevel= " + this.f + "}";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fax
 */
public class fax_0
extends faC {
    private static final byte[] c = new fax_0().b();
    public static final int a = -1;
    private int d = -1;
    @NotNull
    private Map<faI, Integer> e = new EnumMap<faI, Integer>(faI.class);

    @Override
    public void a() {
        this.d(ByteBuffer.wrap(c));
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.f());
        abx_2 abx_22 = new abx_2(this.b(byArray));
        this.b(abx_22);
        abx_22.a(this.d);
        abx_22.a((byte)this.e.size());
        for (Map.Entry<faI, Integer> entry : this.e.entrySet()) {
            abx_22.a((short)entry.getKey().a());
            abx_22.a(entry.getValue());
        }
        return abx_22.c();
    }

    public static fax_0 a(ByteBuffer byteBuffer) {
        fax_0 fax_02 = new fax_0();
        fax_02.d(byteBuffer);
        return fax_02;
    }

    private void d(ByteBuffer byteBuffer) {
        this.c(byteBuffer);
        this.a(byteBuffer.getInt());
        int n = byteBuffer.get();
        EnumMap<faI, Integer> enumMap = new EnumMap<faI, Integer>(faI.class);
        for (int k = 0; k < n; ++k) {
            enumMap.put(faI.a(byteBuffer.getShort()), byteBuffer.getInt());
        }
        this.a(enumMap);
    }

    private int b(byte[] byArray) {
        return this.a(byArray) + 4 + 1 + this.e.size() * 6;
    }

    public int c() {
        return this.d;
    }

    @NotNull
    public Map<faI, Integer> d() {
        return this.e;
    }

    public fax_0 a(int n) {
        this.d = n;
        return this;
    }

    public fax_0 a(@NotNull Map<faI, Integer> map) {
        if (map == null) {
            throw new NullPointerException("m_minCharacteristics is marked non-null but is null");
        }
        this.e = map;
        return this;
    }

    @Override
    public String toString() {
        return "ClientEntrySearchParameters(m_itemRefId=" + this.c() + ", m_minCharacteristics=" + this.d() + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fax_0)) {
            return false;
        }
        fax_0 fax_02 = (fax_0)object;
        if (!fax_02.a(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.c() != fax_02.c()) {
            return false;
        }
        Map<faI, Integer> map = this.d();
        Map<faI, Integer> map2 = fax_02.d();
        return !(map == null ? map2 != null : !((Object)map).equals(map2));
    }

    @Override
    protected boolean a(Object object) {
        return object instanceof fax_0;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + this.c();
        Map<faI, Integer> map = this.d();
        n2 = n2 * 59 + (map == null ? 43 : ((Object)map).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ faC b(int n) {
        return this.a(n);
    }
}


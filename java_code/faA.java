/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class faA
extends faC {
    private static final byte[] a = new faA().b();
    @NotNull
    private List<Integer> c = new ArrayList<Integer>();

    @Override
    public void a() {
        this.d(ByteBuffer.wrap(a));
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.f());
        abx_2 abx_22 = new abx_2(this.b(byArray));
        this.b(abx_22);
        abx_22.a((short)this.c.size());
        this.c.forEach(abx_22::a);
        return abx_22.c();
    }

    public static faA a(ByteBuffer byteBuffer) {
        faA faA2 = new faA();
        faA2.d(byteBuffer);
        return faA2;
    }

    private void d(ByteBuffer byteBuffer) {
        this.c(byteBuffer);
        int n = byteBuffer.getShort();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
        for (int k = 0; k < n; ++k) {
            arrayList.add(byteBuffer.getInt());
        }
        this.a(arrayList);
    }

    private int b(byte[] byArray) {
        return this.a(byArray) + 2 + this.c.size() * 4;
    }

    @Override
    public faC b(int n) {
        if (n == -1) {
            this.c.clear();
        } else {
            this.c.add(n);
        }
        return this;
    }

    @NotNull
    public List<Integer> c() {
        return this.c;
    }

    public faA a(@NotNull List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("m_itemRefIds is marked non-null but is null");
        }
        this.c = list;
        return this;
    }

    @Override
    public String toString() {
        return "ClientOfferSearchParameters(m_itemRefIds=" + this.c() + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof faA)) {
            return false;
        }
        faA faA2 = (faA)object;
        if (!faA2.a(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        List<Integer> list = this.c();
        List<Integer> list2 = faA2.c();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    @Override
    protected boolean a(Object object) {
        return object instanceof faA;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        List<Integer> list = this.c();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }
}


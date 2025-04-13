/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class faB {
    private int a = 0;
    private faM b = faM.i;
    private boolean c = true;
    private int d = -1;

    public void a(abx_2 abx_22) {
        abx_22.a(this.a);
        abx_22.a((byte)this.b.a());
        abx_22.a(this.c);
        abx_22.a(this.d);
    }

    public void b(ByteBuffer byteBuffer) {
        this.c(byteBuffer.getInt());
        this.a(faM.a(byteBuffer.get()));
        this.a(byteBuffer.get() == 1);
        this.d(byteBuffer.getInt());
    }

    public static int i() {
        return 10;
    }

    public int j() {
        return this.a;
    }

    public faM k() {
        return this.b;
    }

    public boolean l() {
        return this.c;
    }

    public int m() {
        return this.d;
    }

    public faB c(int n) {
        this.a = n;
        return this;
    }

    public faB a(faM faM2) {
        this.b = faM2;
        return this;
    }

    public faB a(boolean bl) {
        this.c = bl;
        return this;
    }

    public faB d(int n) {
        this.d = n;
        return this;
    }

    public String toString() {
        return "ClientPagination(m_firstIndex=" + this.j() + ", m_sortType=" + this.k() + ", m_ascendingSort=" + this.l() + ", m_sortParameter=" + this.m() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof faB)) {
            return false;
        }
        faB faB2 = (faB)object;
        if (!faB2.a(this)) {
            return false;
        }
        if (this.j() != faB2.j()) {
            return false;
        }
        if (this.l() != faB2.l()) {
            return false;
        }
        if (this.m() != faB2.m()) {
            return false;
        }
        faM faM2 = this.k();
        faM faM3 = faB2.k();
        return !(faM2 == null ? faM3 != null : !((Object)((Object)faM2)).equals((Object)faM3));
    }

    protected boolean a(Object object) {
        return object instanceof faB;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.j();
        n2 = n2 * 59 + (this.l() ? 79 : 97);
        n2 = n2 * 59 + this.m();
        faM faM2 = this.k();
        n2 = n2 * 59 + (faM2 == null ? 43 : ((Object)((Object)faM2)).hashCode());
        return n2;
    }
}


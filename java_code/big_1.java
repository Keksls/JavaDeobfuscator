/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bIg
 */
public abstract class big_1
extends eyw_1 {
    private aff_1 a;

    protected big_1(int n) {
        super(n);
    }

    public abstract void a(String ... var1);

    public abstract boolean a(exk_2 var1);

    public boolean b(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_1 bmr_13 = (bmr_1)euu_2.f(bmr_12.U_(), exk_22.a());
        if (bmr_13 == null) {
            return false;
        }
        if (bmr_13.cX() && !this.d()) {
            return false;
        }
        return this.f == null || this.f.b(bmr_13, exk_22, null, null);
    }

    protected void a(long l) {
        coc_0 coc_02 = new coc_0(l, this);
        azu_0.j().K().c(coc_02);
    }

    public final void a(aff_1 aff_12) {
        this.a = aff_12;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.k()) {
            if (this.a == null) {
                byteBuffer.put((byte)0);
            } else {
                byteBuffer.put((byte)1);
                byteBuffer.putInt(this.a.d());
                byteBuffer.putInt(this.a.e());
                byteBuffer.putShort(this.a.f());
            }
        }
        return true;
    }

    @Override
    public int b() {
        if (this.k()) {
            if (this.a == null) {
                return 1;
            }
            return 11;
        }
        return 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Pas de d\u00e9s\u00e9rialization dans le Client");
    }

    public String a() {
        return null;
    }

    protected boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }
}


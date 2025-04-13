/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

public class eBm {
    private final boolean a;
    private final exh_2 b;
    @Nullable
    private final Long c;

    private eBm(boolean bl, exh_2 exh_22, @Nullable Long l) {
        this.a = bl;
        this.b = exh_22;
        this.c = l;
    }

    public static eBm a(exh_2 exh_22, long l) {
        return new eBm(true, exh_22, l);
    }

    public static eBm a(exh_2 exh_22) {
        return new eBm(false, exh_22, null);
    }

    public void a(abx_2 abx_22) {
        if (this.a) {
            abx_22.a(true);
            abx_22.a(this.b.A);
            abx_22.a(this.c);
        } else {
            abx_22.a(false);
            abx_22.a(this.b.A);
        }
    }

    public static eBm a(ByteBuffer byteBuffer) {
        boolean bl = byteBuffer.get() == 1;
        exh_2 exh_22 = exh_2.a(byteBuffer.get());
        if (bl) {
            return eBm.a(exh_22, byteBuffer.getLong());
        }
        return eBm.a(exh_22);
    }

    public int a() {
        return 2 + (this.a ? 8 : 0);
    }

    public boolean b() {
        return this.a;
    }

    public exh_2 c() {
        return this.b;
    }

    @Nullable
    public Long d() {
        return this.c;
    }

    public String toString() {
        return "CompanionEquipmentModification(m_addingItem=" + this.b() + ", m_position=" + this.c() + ", m_itemUid=" + this.d() + ")";
    }
}


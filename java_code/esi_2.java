/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eSI
 */
public class esi_2
extends esl_2 {
    private long a;
    private int b;

    esi_2() {
    }

    public esi_2(long l, int n) {
        this.a = l;
        this.b = n;
    }

    @Override
    public esn_2 a() {
        return esn_2.f;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
    }

    @Override
    public void a(esd_2 esd_22) {
        esd_22.a(this);
    }

    @Override
    public void a(ese_2 ese_22) {
        ese_22.a(this);
    }

    public long b() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public int c() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    @Override
    public String toString() {
        return "BuildingEquip{m_buildingUid=" + this.a + ", m_itemId=" + this.b + "} " + super.toString();
    }
}


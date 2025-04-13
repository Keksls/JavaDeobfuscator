/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eTb
 */
public final class etb_1
extends esl_2 {
    private long a;

    public etb_1() {
    }

    public etb_1(long l) {
        this.a = l;
    }

    @Override
    public esn_2 a() {
        return esn_2.i;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
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

    @Override
    public String toString() {
        return "InteractiveElementDelete{m_elementUid=" + this.a + "} " + super.toString();
    }
}


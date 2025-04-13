/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eRw
 */
final class erw_0
implements eqw_0 {
    private String a;

    erw_0(String string) {
        this.a = string;
    }

    erw_0() {
    }

    @Override
    public byte[] a() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = Cz.a(byArray);
    }

    @Override
    public void a(eQk eQk2) {
        eQk2.b(this.a);
    }

    @Override
    public eqy_0 b() {
        return eqy_0.o;
    }

    public String toString() {
        return "NameChange{m_name='" + this.a + "'}";
    }
}


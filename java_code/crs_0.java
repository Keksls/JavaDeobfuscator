/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crS
 */
public class crs_0
extends ps_0 {
    private String a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 23465;
    }

    public String b() {
        return this.a;
    }

    @Override
    public String toString() {
        return "AuthentificationTokenResultMessage{m_token='" + this.a + "'}";
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csv
 */
public class csv_0
extends ps_0 {
    private int a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12549;
    }

    public int b() {
        return this.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class crT
extends ps_0 {
    private long a;
    private eza_2 b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray == null) {
            return false;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));){
            this.a = dataInputStream.readLong();
            this.b = eza_2.a(dataInputStream.readByte());
            this.c = dataInputStream.readBoolean();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to read message of length " + byArray.length, iOException);
        }
        return true;
    }

    @Override
    public int a() {
        return 13024;
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public eza_2 d() {
        return this.b;
    }
}


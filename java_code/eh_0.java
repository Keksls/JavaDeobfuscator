/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.base.Charsets;
import com.google.common.io.LittleEndianDataOutputStream;

/*
 * Renamed from Eh
 */
public final class eh_0
implements gh_0 {
    private final LittleEndianDataOutputStream a;

    public eh_0(LittleEndianDataOutputStream littleEndianDataOutputStream) {
        this.a = littleEndianDataOutputStream;
    }

    @Override
    public void a(byte by) {
        this.a.writeByte((int)by);
    }

    @Override
    public void a(short s2) {
        this.a.writeShort((int)s2);
    }

    @Override
    public void a(int n) {
        this.a.writeInt(n);
    }

    @Override
    public void a(float f2) {
        this.a.writeFloat(f2);
    }

    @Override
    public void a(String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8.name());
        this.a.write(byArray);
        this.a.writeByte(0);
    }
}


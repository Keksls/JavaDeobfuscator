/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXZ
 */
public class exz_2
implements efi_0 {
    public static final short a = 0;
    public static final short b = 0;
    public static final short c = 0;
    private final ArrayList<efh_0> d = new ArrayList();
    private final short e;
    private final short f;

    public exz_2(short s2, short s3) {
        this.f = s2;
        this.e = s3;
    }

    public short a() {
        return this.f;
    }

    @Override
    public short c() {
        return 0;
    }

    @Override
    public int G_() {
        return 14;
    }

    @Override
    public long aS_() {
        return this.e;
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return this.d.iterator();
    }

    public void a(efh_0 efh_02) {
        this.d.add(efh_02);
    }

    public int g() {
        return this.d.size();
    }

    @Override
    public short be_() {
        return 0;
    }

    @Override
    public short z_() {
        return 0;
    }

    @Override
    public short A_() {
        return 0;
    }
}


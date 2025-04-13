/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

public final class fhv {
    private fhv() {
    }

    @Nullable
    public static fhx a(ByteBuffer byteBuffer) {
        fhu fhu2 = fhu.a(byteBuffer.get());
        if (fhu2 == null) {
            return null;
        }
        switch (fhu2) {
            case b: {
                return new fhs(byteBuffer);
            }
            case c: {
                return new fht_0(byteBuffer);
            }
        }
        return new fhr(byteBuffer);
    }

    public static void a(fhx fhx2, abx_2 abx_22) {
        abx_22.a(fhx2.a().a());
        fhx2.a(abx_22);
    }
}


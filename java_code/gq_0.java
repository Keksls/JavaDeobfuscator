/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Preconditions;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from GQ
 */
public class gq_0
implements gn_0 {
    protected static final byte[] a = new byte[0];
    private final URL b;
    private boolean c;
    private boolean d;
    @Nullable
    private byte[] e;

    gq_0(URL uRL) {
        this.b = uRL;
        this.c = false;
        this.d = false;
    }

    @Override
    public void a() {
        Preconditions.checkState((!this.c ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        Preconditions.checkState((!this.d ? 1 : 0) != 0, (Object)"Stream must not be call if the file is already loaded");
        URLConnection uRLConnection = this.b.openConnection();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnection.getInputStream());
        this.e = new byte[uRLConnection.getContentLength()];
        try {
            if (((InputStream)bufferedInputStream).read(this.e) > 0) {
                this.c = true;
            } else {
                this.d = true;
            }
        }
        finally {
            ((InputStream)bufferedInputStream).close();
        }
    }

    @Override
    public void c() {
        this.d = true;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    @Override
    public final String b() {
        return this.b.getPath();
    }

    public final byte[] f() {
        return Optional.ofNullable(this.e).orElse(a);
    }

    public String toString() {
        return this.b == null ? "null" : this.b + " ready=" + this.c;
    }
}


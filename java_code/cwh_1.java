/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwH
 */
public class cwh_1
extends ps_0 {
    private static final Logger a = Logger.getLogger(cwh_1.class);
    private ww_0 b;
    private wt_0 c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = wt_0.b(byteBuffer.getLong());
        this.b = ww_0.a(byteBuffer.getLong());
        return true;
    }

    public wx_0 b() {
        return this.b;
    }

    public wt_0 c() {
        return this.c;
    }

    @Override
    public int a() {
        return 15052;
    }
}


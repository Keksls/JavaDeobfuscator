/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;

/*
 * Renamed from aAo
 */
public class aao_1
implements aak_2 {
    protected static final Logger a = Logger.getLogger(aao_1.class);
    JFrame b;
    final aag_2 c = new aag_2();

    public void a() {
        SwingUtilities.invokeLater(new aap_1(this));
    }

    @Override
    public void a(aai_2 aai_22) {
        this.c.a(aai_22.d(), aai_22.e(), aai_22.a());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from aNt
 */
class ant_0
implements anp_1 {
    final /* synthetic */ ans_0 a;

    ant_0(ans_0 ans_02) {
        this.a = ans_02;
    }

    @Override
    public void a(ano_1 ano_12) {
        this.a.b().b(this);
        SwingUtilities.invokeLater(() -> {
            try {
                this.a.I();
            }
            catch (Exception exception) {
                ans_0.i.fatal((Object)"Erreur au lancement", (Throwable)exception);
                JOptionPane.showMessageDialog(null, exception, "Error", 0);
                System.exit(0);
            }
        });
    }
}


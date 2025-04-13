/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Renamed from ahc
 */
class ahc_0
extends JPanel {
    final JTextField a;
    final JLabel b = new JLabel("fps");

    ahc_0() {
        super(new FlowLayout(0, 0, 0), true);
        this.a = new JTextField();
        this.a.setEnabled(false);
        this.a.setDisabledTextColor(Color.BLACK);
        this.a.setHorizontalAlignment(4);
        this.a.setPreferredSize(new Dimension(40, 20));
        this.add(this.a);
        this.add(this.b);
    }
}


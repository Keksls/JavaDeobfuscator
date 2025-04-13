/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intellij.uiDesigner.core.GridConstraints
 *  com.intellij.uiDesigner.core.GridLayoutManager
 */
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import java.awt.Component;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from aCM
 */
public class acm_1
extends JFrame {
    private static final Pattern d = Pattern.compile("\\.");
    public JTable a;
    public JPanel b;
    public JScrollPane c;
    final DefaultTableModel e;

    public acm_1() {
        this.c();
        this.add(this.b);
        this.e = new DefaultTableModel();
        this.a.setModel(this.e);
        this.e.addColumn("object");
        this.e.addColumn("count");
        this.e.addColumn("mean rate");
        this.e.addColumn("1-minute rate");
        this.e.addColumn("5-minute rate");
        this.e.addColumn("15-minute rate");
        this.e.addColumn("min");
        this.e.addColumn("max");
        this.e.addColumn("mean");
        this.e.addColumn("stddev");
        this.e.addColumn("median");
        this.e.addColumn("75%");
        this.e.addColumn("95%");
        this.e.addColumn("98%");
        this.e.addColumn("99%");
        this.e.addColumn("99.9%");
    }

    public final void a() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(new acn_1(this), 1L, 1L, TimeUnit.SECONDS);
    }

    private void c() {
        this.b = new JPanel();
        this.b.setLayout((LayoutManager)new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        this.c = new JScrollPane();
        this.b.add((Component)this.c, new GridConstraints(0, 0, 1, 1, 0, 3, 5, 5, null, null, null, 0, false));
        this.a = new JTable();
        this.a.setAutoCreateRowSorter(true);
        this.c.setViewportView(this.a);
    }

    public JComponent b() {
        return this.b;
    }

    public static void a(String ... stringArray) {
        acm_1 acm_12 = new acm_1();
        acm_12.setTitle("MonitoredPool Analyzer");
        acm_12.setDefaultCloseOperation(3);
        acm_12.setSize(800, 600);
        acm_12.setVisible(true);
        acm_12.a();
    }
}


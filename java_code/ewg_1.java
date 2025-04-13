/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.AppenderSkeleton
 *  org.apache.log4j.spi.LoggingEvent
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;
import java.util.Enumeration;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from eWg
 */
public class ewg_1
extends AppenderSkeleton {
    final JTable b;
    final ewj_1 a = new ewj_1();
    private static final int c = 3000;
    private final JScrollPane d;
    private final JFrame e;
    private final JLabel f;
    private final JCheckBox g;

    public ewg_1(String string) {
        String string2 = ewg_1.a(string);
        this.setName(string2);
        this.e = new JFrame(string2);
        this.b = new JTable(this.a);
        this.d = new JScrollPane(this.b);
        this.d.setSize(new Dimension(1024, 768));
        this.e.getContentPane().add((Component)this.d, "Center");
        JPanel jPanel = new JPanel();
        this.f = new JLabel();
        jPanel.add(this.f);
        this.g = new JCheckBox("AutoScroll enabled");
        this.g.setSelected(true);
        jPanel.add(this.g);
        JButton jButton = new JButton("Clear");
        jButton.addActionListener(new ewh_1(this));
        jPanel.add(jButton);
        this.e.getContentPane().add((Component)jPanel, "North");
        this.a();
        this.e.pack();
        this.e.setVisible(true);
        this.e.setDefaultCloseOperation(2);
    }

    public static String a(String string) {
        return "ItemTrackerViewer" + string;
    }

    protected void append(LoggingEvent loggingEvent) {
        String string = (String)loggingEvent.getMessage();
        String[] stringArray = string.split(",");
        String[] stringArray2 = new String[stringArray.length + 1];
        stringArray2[0] = loggingEvent.getLevel().toString();
        System.arraycopy(stringArray, 0, stringArray2, 1, stringArray.length);
        if (this.a.getRowCount() == 3000) {
            this.a.a(0);
        }
        this.a.a(stringArray2);
        this.a();
    }

    private void a() {
        Serializable serializable;
        int n = 0;
        boolean bl = false;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        JTableHeader jTableHeader = this.b.getTableHeader();
        Enumeration<TableColumn> enumeration = this.b.getColumnModel().getColumns();
        this.b.setAutoResizeMode(0);
        while (enumeration.hasMoreElements()) {
            serializable = enumeration.nextElement();
            n = jTableHeader.getColumnModel().getColumnIndex(((TableColumn)serializable).getIdentifier());
            n5 = (int)this.b.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(this.b, ((TableColumn)serializable).getIdentifier(), false, false, -1, n).getPreferredSize().getWidth();
            for (n4 = 0; n4 < this.b.getRowCount(); ++n4) {
                int n6 = (int)this.b.getCellRenderer(n4, n).getTableCellRendererComponent(this.b, this.b.getValueAt(n4, n), false, false, n4, n).getPreferredSize().getWidth();
                n5 = Math.max(n5, n6);
            }
            jTableHeader.setResizingColumn((TableColumn)serializable);
            n2 = n5 + this.b.getIntercellSpacing().width;
            n3 += (n2 += 10);
            ((TableColumn)serializable).setWidth(n2);
        }
        this.f.setText(this.a.getRowCount() + " line(s)" + (this.a.getRowCount() == 3000 ? " (limit reached ! rolling...)" : ""));
        serializable = this.e.getLocation();
        this.d.setPreferredSize(new Dimension(n3 + 30, this.d.getHeight()));
        if (this.g.isSelected()) {
            SwingUtilities.invokeLater(new ewi_1(this));
        }
        this.e.pack();
        this.e.setLocation((Point)serializable);
    }

    public void close() {
        this.e.dispose();
    }

    public boolean requiresLayout() {
        return false;
    }
}


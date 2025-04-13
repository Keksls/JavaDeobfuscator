/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from oj
 */
public final class oj_1
extends GeneratedMessageV3
implements on_1 {
    private static final long c = 0L;
    public static final int a = 1;
    MapField<String, String> d;
    private byte e = (byte)-1;
    private static final oj_1 f = new oj_1();
    @Deprecated
    public static final Parser<oj_1> b = new ok_1();

    oj_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private oj_1() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    oj_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = MapField.newMapField(om_1.a);
                    bl |= true;
                }
                MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(om_1.a.getParserForType(), extensionRegistryLite);
                this.d.getMutableMap().put((String)mapEntry.getKey(), (String)mapEntry.getValue());
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return nz_0.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.l();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nz_0.b.ensureFieldAccessorsInitialized(oj_1.class, ol_1.class);
    }

    MapField<String, String> l() {
        if (this.d == null) {
            return MapField.emptyMapField(om_1.a);
        }
        return this.d;
    }

    @Override
    public int b() {
        return this.l().getMap().size();
    }

    @Override
    public boolean a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return this.l().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> c() {
        return this.d();
    }

    @Override
    public Map<String, String> d() {
        return this.l().getMap();
    }

    @Override
    public String a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.l().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.l().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeStringMapTo((CodedOutputStream)codedOutputStream, this.l(), om_1.a, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.l().getMap().entrySet()) {
            MapEntry mapEntry = om_1.a.newBuilderForType().setKey((Object)((String)entry.getKey())).setValue((Object)((String)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oj_1)) {
            return super.equals(object);
        }
        oj_1 oj_12 = (oj_1)object;
        boolean bl = true;
        bl = bl && this.l().equals(oj_12.l());
        bl = bl && this.unknownFields.equals((Object)oj_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + oj_1.a().hashCode();
        if (!this.l().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.l().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static oj_1 a(ByteBuffer byteBuffer) {
        return (oj_1)b.parseFrom(byteBuffer);
    }

    public static oj_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (oj_1)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static oj_1 a(ByteString byteString) {
        return (oj_1)b.parseFrom(byteString);
    }

    public static oj_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (oj_1)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static oj_1 a(byte[] byArray) {
        return (oj_1)b.parseFrom(byArray);
    }

    public static oj_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (oj_1)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static oj_1 a(InputStream inputStream) {
        return (oj_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static oj_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oj_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oj_1 b(InputStream inputStream) {
        return (oj_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static oj_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oj_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oj_1 a(CodedInputStream codedInputStream) {
        return (oj_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static oj_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oj_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ol_1 e() {
        return oj_1.f();
    }

    public static ol_1 f() {
        return f.g();
    }

    public static ol_1 a(oj_1 oj_12) {
        return f.g().a(oj_12);
    }

    public ol_1 g() {
        return this == f ? new ol_1() : new ol_1().a(this);
    }

    protected ol_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        ol_1 ol_12 = new ol_1(builderParent);
        return ol_12;
    }

    public static oj_1 h() {
        return f;
    }

    public static Parser<oj_1> i() {
        return b;
    }

    public Parser<oj_1> getParserForType() {
        return b;
    }

    public oj_1 j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(oj_1 oj_12) {
        return oj_12.unknownFields;
    }
}


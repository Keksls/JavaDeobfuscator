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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from hX
 */
public final class hx_0
extends GeneratedMessageV3
implements ia_0 {
    private static final long c = 0L;
    public static final int a = 1;
    List<le_0> d;
    private byte e = (byte)-1;
    private static final hx_0 f = new hx_0();
    @Deprecated
    public static final Parser<hx_0> b = new hy_0();

    hx_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hx_0() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hx_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.d = new ArrayList<le_0>();
                    bl |= true;
                }
                this.d.add((le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return hR.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hR.l.ensureFieldAccessorsInitialized(hx_0.class, hz_0.class);
    }

    @Override
    public List<le_0> b() {
        return this.d;
    }

    @Override
    public List<? extends lp> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public le_0 a(int n) {
        return this.d.get(n);
    }

    @Override
    public lp b(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.d.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.d.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hx_0)) {
            return super.equals(object);
        }
        hx_0 hx_02 = (hx_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(hx_02.b());
        bl = bl && this.unknownFields.equals((Object)hx_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hx_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hx_0 a(ByteBuffer byteBuffer) {
        return (hx_0)b.parseFrom(byteBuffer);
    }

    public static hx_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hx_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hx_0 a(ByteString byteString) {
        return (hx_0)b.parseFrom(byteString);
    }

    public static hx_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hx_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static hx_0 a(byte[] byArray) {
        return (hx_0)b.parseFrom(byArray);
    }

    public static hx_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hx_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static hx_0 a(InputStream inputStream) {
        return (hx_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static hx_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hx_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hx_0 b(InputStream inputStream) {
        return (hx_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static hx_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hx_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hx_0 a(CodedInputStream codedInputStream) {
        return (hx_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static hx_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hx_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hz_0 e() {
        return hx_0.f();
    }

    public static hz_0 f() {
        return f.g();
    }

    public static hz_0 a(hx_0 hx_02) {
        return f.g().a(hx_02);
    }

    public hz_0 g() {
        return this == f ? new hz_0() : new hz_0().a(this);
    }

    protected hz_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        hz_0 hz_02 = new hz_0(builderParent);
        return hz_02;
    }

    public static hx_0 h() {
        return f;
    }

    public static Parser<hx_0> i() {
        return b;
    }

    public Parser<hx_0> getParserForType() {
        return b;
    }

    public hx_0 j() {
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

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hx_0 hx_02) {
        return hx_02.unknownFields;
    }
}


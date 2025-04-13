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
 * Renamed from lt
 */
public final class lt_0
extends GeneratedMessageV3
implements lw_0 {
    private static final long c = 0L;
    public static final int a = 1;
    List<lq_0> d;
    private byte e = (byte)-1;
    private static final lt_0 f = new lt_0();
    @Deprecated
    public static final Parser<lt_0> b = new lu_0();

    lt_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lt_0() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lt_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.d = new ArrayList<lq_0>();
                    bl |= true;
                }
                this.d.add((lq_0)codedInputStream.readMessage(lq_0.c, extensionRegistryLite));
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
        return kM.E;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.F.ensureFieldAccessorsInitialized(lt_0.class, lv_0.class);
    }

    @Override
    public List<lq_0> b() {
        return this.d;
    }

    @Override
    public List<? extends lx> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public lq_0 a(int n) {
        return this.d.get(n);
    }

    @Override
    public lx b(int n) {
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
        if (!(object instanceof lt_0)) {
            return super.equals(object);
        }
        lt_0 lt_02 = (lt_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(lt_02.b());
        bl = bl && this.unknownFields.equals((Object)lt_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lt_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lt_0 a(ByteBuffer byteBuffer) {
        return (lt_0)b.parseFrom(byteBuffer);
    }

    public static lt_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lt_0 a(ByteString byteString) {
        return (lt_0)b.parseFrom(byteString);
    }

    public static lt_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static lt_0 a(byte[] byArray) {
        return (lt_0)b.parseFrom(byArray);
    }

    public static lt_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static lt_0 a(InputStream inputStream) {
        return (lt_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static lt_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lt_0 b(InputStream inputStream) {
        return (lt_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static lt_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lt_0 a(CodedInputStream codedInputStream) {
        return (lt_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static lt_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lv_0 e() {
        return lt_0.f();
    }

    public static lv_0 f() {
        return f.g();
    }

    public static lv_0 a(lt_0 lt_02) {
        return f.g().a(lt_02);
    }

    public lv_0 g() {
        return this == f ? new lv_0() : new lv_0().a(this);
    }

    protected lv_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        lv_0 lv_02 = new lv_0(builderParent);
        return lv_02;
    }

    public static lt_0 h() {
        return f;
    }

    public static Parser<lt_0> i() {
        return b;
    }

    public Parser<lt_0> getParserForType() {
        return b;
    }

    public lt_0 j() {
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

    static /* synthetic */ UnknownFieldSet b(lt_0 lt_02) {
        return lt_02.unknownFields;
    }
}


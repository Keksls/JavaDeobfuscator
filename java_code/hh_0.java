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
 * Renamed from hh
 */
public final class hh_0
extends GeneratedMessageV3
implements hk_0 {
    private static final long c = 0L;
    public static final int a = 1;
    List<hd_0> d;
    private byte e = (byte)-1;
    private static final hh_0 f = new hh_0();
    @Deprecated
    public static final Parser<hh_0> b = new hi_0();

    hh_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hh_0() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hh_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.d = new ArrayList<hd_0>();
                    bl |= true;
                }
                this.d.add((hd_0)codedInputStream.readMessage(hd_0.c, extensionRegistryLite));
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
        return hb.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hb.b.ensureFieldAccessorsInitialized(hh_0.class, hj_0.class);
    }

    @Override
    public List<hd_0> b() {
        return this.d;
    }

    @Override
    public List<? extends hg_0> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public hd_0 a(int n) {
        return this.d.get(n);
    }

    @Override
    public hg_0 b(int n) {
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
        if (!(object instanceof hh_0)) {
            return super.equals(object);
        }
        hh_0 hh_02 = (hh_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(hh_02.b());
        bl = bl && this.unknownFields.equals((Object)hh_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hh_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hh_0 a(ByteBuffer byteBuffer) {
        return (hh_0)b.parseFrom(byteBuffer);
    }

    public static hh_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hh_0 a(ByteString byteString) {
        return (hh_0)b.parseFrom(byteString);
    }

    public static hh_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static hh_0 a(byte[] byArray) {
        return (hh_0)b.parseFrom(byArray);
    }

    public static hh_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static hh_0 a(InputStream inputStream) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static hh_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hh_0 b(InputStream inputStream) {
        return (hh_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static hh_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hh_0 a(CodedInputStream codedInputStream) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static hh_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hj_0 e() {
        return hh_0.f();
    }

    public static hj_0 f() {
        return f.g();
    }

    public static hj_0 a(hh_0 hh_02) {
        return f.g().a(hh_02);
    }

    public hj_0 g() {
        return this == f ? new hj_0() : new hj_0().a(this);
    }

    protected hj_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        hj_0 hj_02 = new hj_0(builderParent);
        return hj_02;
    }

    public static hh_0 h() {
        return f;
    }

    public static Parser<hh_0> i() {
        return b;
    }

    public Parser<hh_0> getParserForType() {
        return b;
    }

    public hh_0 j() {
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

    static /* synthetic */ UnknownFieldSet b(hh_0 hh_02) {
        return hh_02.unknownFields;
    }
}


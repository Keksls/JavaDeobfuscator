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

public final class kW
extends GeneratedMessageV3
implements kZ {
    private static final long c = 0L;
    public static final int a = 1;
    List<kO> d;
    private byte e = (byte)-1;
    private static final kW f = new kW();
    @Deprecated
    public static final Parser<kW> b = new kX();

    kW(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kW() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.d = new ArrayList<kO>();
                    bl |= true;
                }
                this.d.add((kO)codedInputStream.readMessage(kO.f, extensionRegistryLite));
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
        return kM.y;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.z.ensureFieldAccessorsInitialized(kW.class, kY.class);
    }

    @Override
    public List<kO> b() {
        return this.d;
    }

    @Override
    public List<? extends kV> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public kO a(int n) {
        return this.d.get(n);
    }

    @Override
    public kV b(int n) {
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
        if (!(object instanceof kW)) {
            return super.equals(object);
        }
        kW kW2 = (kW)object;
        boolean bl = true;
        bl = bl && this.b().equals(kW2.b());
        bl = bl && this.unknownFields.equals((Object)kW2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kW.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kW a(ByteBuffer byteBuffer) {
        return (kW)b.parseFrom(byteBuffer);
    }

    public static kW a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kW a(ByteString byteString) {
        return (kW)b.parseFrom(byteString);
    }

    public static kW a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static kW a(byte[] byArray) {
        return (kW)b.parseFrom(byArray);
    }

    public static kW a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static kW a(InputStream inputStream) {
        return (kW)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static kW a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kW b(InputStream inputStream) {
        return (kW)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static kW b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kW a(CodedInputStream codedInputStream) {
        return (kW)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static kW a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kY e() {
        return kW.f();
    }

    public static kY f() {
        return f.g();
    }

    public static kY a(kW kW2) {
        return f.g().a(kW2);
    }

    public kY g() {
        return this == f ? new kY() : new kY().a(this);
    }

    protected kY a(GeneratedMessageV3.BuilderParent builderParent) {
        kY kY2 = new kY(builderParent);
        return kY2;
    }

    public static kW h() {
        return f;
    }

    public static Parser<kW> i() {
        return b;
    }

    public Parser<kW> getParserForType() {
        return b;
    }

    public kW j() {
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

    static /* synthetic */ UnknownFieldSet b(kW kW2) {
        return kW2.unknownFields;
    }
}


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
 * Renamed from fv
 */
public final class fv_2
extends GeneratedMessageV3
implements fy_1 {
    private static final long c = 0L;
    public static final int a = 1;
    List<fk_2> d;
    private byte e = (byte)-1;
    private static final fv_2 f = new fv_2();
    @Deprecated
    public static final Parser<fv_2> b = new fw_1();

    fv_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fv_2() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fv_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.d = new ArrayList<fk_2>();
                    bl |= true;
                }
                this.d.add((fk_2)codedInputStream.readMessage(fk_2.d, extensionRegistryLite));
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
        return fr_1.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.l.ensureFieldAccessorsInitialized(fv_2.class, fx_1.class);
    }

    @Override
    public List<fk_2> b() {
        return this.d;
    }

    @Override
    public List<? extends fn_2> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public fk_2 a(int n) {
        return this.d.get(n);
    }

    @Override
    public fn_2 b(int n) {
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
        if (!(object instanceof fv_2)) {
            return super.equals(object);
        }
        fv_2 fv_22 = (fv_2)object;
        boolean bl = true;
        bl = bl && this.b().equals(fv_22.b());
        bl = bl && this.unknownFields.equals((Object)fv_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fv_2.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fv_2 a(ByteBuffer byteBuffer) {
        return (fv_2)b.parseFrom(byteBuffer);
    }

    public static fv_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fv_2)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fv_2 a(ByteString byteString) {
        return (fv_2)b.parseFrom(byteString);
    }

    public static fv_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fv_2)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static fv_2 a(byte[] byArray) {
        return (fv_2)b.parseFrom(byArray);
    }

    public static fv_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fv_2)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static fv_2 a(InputStream inputStream) {
        return (fv_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static fv_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fv_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fv_2 b(InputStream inputStream) {
        return (fv_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static fv_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fv_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fv_2 a(CodedInputStream codedInputStream) {
        return (fv_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static fv_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fv_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fx_1 e() {
        return fv_2.f();
    }

    public static fx_1 f() {
        return f.g();
    }

    public static fx_1 a(fv_2 fv_22) {
        return f.g().a(fv_22);
    }

    public fx_1 g() {
        return this == f ? new fx_1() : new fx_1().a(this);
    }

    protected fx_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        fx_1 fx_12 = new fx_1(builderParent);
        return fx_12;
    }

    public static fv_2 h() {
        return f;
    }

    public static Parser<fv_2> i() {
        return b;
    }

    public Parser<fv_2> getParserForType() {
        return b;
    }

    public fv_2 j() {
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

    static /* synthetic */ UnknownFieldSet b(fv_2 fv_22) {
        return fv_22.unknownFields;
    }
}


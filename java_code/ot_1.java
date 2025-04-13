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
 * Renamed from ot
 */
public final class ot_1
extends GeneratedMessageV3
implements ow_2 {
    private static final long c = 0L;
    public static final int a = 1;
    List<oq_1> d;
    private byte e = (byte)-1;
    private static final ot_1 f = new ot_1();
    @Deprecated
    public static final Parser<ot_1> b = new ou_2();

    ot_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ot_1() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ot_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.d = new ArrayList<oq_1>();
                    bl |= true;
                }
                this.d.add((oq_1)codedInputStream.readMessage(oq_1.m, extensionRegistryLite));
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
        return oo_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo_1.f.ensureFieldAccessorsInitialized(ot_1.class, ov_2.class);
    }

    @Override
    public List<oq_1> b() {
        return this.d;
    }

    @Override
    public List<? extends ox_2> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public oq_1 a(int n) {
        return this.d.get(n);
    }

    @Override
    public ox_2 b(int n) {
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
        if (!(object instanceof ot_1)) {
            return super.equals(object);
        }
        ot_1 ot_12 = (ot_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(ot_12.b());
        bl = bl && this.unknownFields.equals((Object)ot_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ot_1.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ot_1 a(ByteBuffer byteBuffer) {
        return (ot_1)b.parseFrom(byteBuffer);
    }

    public static ot_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ot_1)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ot_1 a(ByteString byteString) {
        return (ot_1)b.parseFrom(byteString);
    }

    public static ot_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ot_1)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static ot_1 a(byte[] byArray) {
        return (ot_1)b.parseFrom(byArray);
    }

    public static ot_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ot_1)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static ot_1 a(InputStream inputStream) {
        return (ot_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static ot_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ot_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ot_1 b(InputStream inputStream) {
        return (ot_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static ot_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ot_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ot_1 a(CodedInputStream codedInputStream) {
        return (ot_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static ot_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ot_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ov_2 e() {
        return ot_1.f();
    }

    public static ov_2 f() {
        return f.g();
    }

    public static ov_2 a(ot_1 ot_12) {
        return f.g().a(ot_12);
    }

    public ov_2 g() {
        return this == f ? new ov_2() : new ov_2().a(this);
    }

    protected ov_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        ov_2 ov_22 = new ov_2(builderParent);
        return ov_22;
    }

    public static ot_1 h() {
        return f;
    }

    public static Parser<ot_1> i() {
        return b;
    }

    public Parser<ot_1> getParserForType() {
        return b;
    }

    public ot_1 j() {
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

    static /* synthetic */ UnknownFieldSet b(ot_1 ot_12) {
        return ot_12.unknownFields;
    }
}


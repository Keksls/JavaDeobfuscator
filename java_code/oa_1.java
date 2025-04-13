/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from oA
 */
public final class oa_1
extends GeneratedMessageV3.Builder<oa_1>
implements ob_1 {
    private int a;
    private List<Integer> b = Collections.emptyList();
    private int c;

    public static final Descriptors.Descriptor a() {
        return oo_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo_1.b.ensureFieldAccessorsInitialized(oy_2.class, oa_1.class);
    }

    oa_1() {
        this.m();
    }

    oa_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (oy_2.l()) {
            // empty if block
        }
    }

    public oa_1 f() {
        super.clear();
        this.b = Collections.emptyList();
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return oo_1.a;
    }

    public oy_2 g() {
        return oy_2.i();
    }

    public oy_2 h() {
        oy_2 oy_22 = this.i();
        if (!oy_22.isInitialized()) {
            throw oa_1.newUninitializedMessageException((Message)oy_22);
        }
        return oy_22;
    }

    public oy_2 i() {
        oy_2 oy_22 = new oy_2(this);
        int n = this.a;
        int n2 = 0;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= 0xFFFFFFFE;
        }
        oy_22.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        oy_22.g = this.c;
        oy_22.e = n2;
        this.onBuilt();
        return oy_22;
    }

    public oa_1 j() {
        return (oa_1)super.clone();
    }

    public oa_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oa_1)super.setField(fieldDescriptor, object);
    }

    public oa_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (oa_1)super.clearField(fieldDescriptor);
    }

    public oa_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (oa_1)super.clearOneof(oneofDescriptor);
    }

    public oa_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (oa_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public oa_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oa_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public oa_1 a(Message message) {
        if (message instanceof oy_2) {
            return this.a((oy_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public oa_1 a(oy_2 oy_22) {
        if (oy_22 == oy_2.i()) {
            return this;
        }
        if (!oy_22.f.isEmpty()) {
            if (this.b.isEmpty()) {
                this.b = oy_22.f;
                this.a &= 0xFFFFFFFE;
            } else {
                this.n();
                this.b.addAll(oy_22.f);
            }
            this.onChanged();
        }
        if (oy_22.d()) {
            this.c(oy_22.e());
        }
        this.b(oy_2.b(oy_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.d();
    }

    public oa_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        oy_2 oy_22 = null;
        try {
            oy_22 = (oy_2)oy_2.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            oy_22 = (oy_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (oy_22 != null) {
                this.a(oy_22);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<Integer>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<Integer> b() {
        return Collections.unmodifiableList(this.b);
    }

    @Override
    public int c() {
        return this.b.size();
    }

    @Override
    public int a(int n) {
        return this.b.get(n);
    }

    public oa_1 a(int n, int n2) {
        this.n();
        this.b.set(n, n2);
        this.onChanged();
        return this;
    }

    public oa_1 b(int n) {
        this.n();
        this.b.add(n);
        this.onChanged();
        return this;
    }

    public oa_1 a(Iterable<? extends Integer> iterable) {
        this.n();
        AbstractMessageLite.Builder.addAll(iterable, this.b);
        this.onChanged();
        return this;
    }

    public oa_1 k() {
        this.b = Collections.emptyList();
        this.a &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public oa_1 c(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public oa_1 l() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    public final oa_1 a(UnknownFieldSet unknownFieldSet) {
        return (oa_1)super.setUnknownFields(unknownFieldSet);
    }

    public final oa_1 b(UnknownFieldSet unknownFieldSet) {
        return (oa_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}


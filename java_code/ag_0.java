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
 * Renamed from AG
 */
public final class ag_0
extends GeneratedMessageV3.Builder<ag_0>
implements ah_0 {
    private int a;
    private int b = 1;
    private List<Integer> c = Collections.emptyList();

    public static final Descriptors.Descriptor a() {
        return aw_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return aw_0.d.ensureFieldAccessorsInitialized(ae_0.class, ag_0.class);
    }

    ag_0() {
        this.m();
    }

    ag_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (ae_0.l()) {
            // empty if block
        }
    }

    public ag_0 f() {
        super.clear();
        this.b = 1;
        this.a &= 0xFFFFFFFE;
        this.c = Collections.emptyList();
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return aw_0.c;
    }

    public ae_0 g() {
        return ae_0.i();
    }

    public ae_0 h() {
        ae_0 ae_02 = this.i();
        if (!ae_02.isInitialized()) {
            throw ag_0.newUninitializedMessageException((Message)ae_02);
        }
        return ae_02;
    }

    public ae_0 i() {
        ae_0 ae_02 = new ae_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ae_02.f = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= 0xFFFFFFFD;
        }
        ae_02.g = this.c;
        ae_02.e = n2;
        this.onBuilt();
        return ae_02;
    }

    public ag_0 j() {
        return (ag_0)super.clone();
    }

    public ag_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ag_0)super.setField(fieldDescriptor, object);
    }

    public ag_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ag_0)super.clearField(fieldDescriptor);
    }

    public ag_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ag_0)super.clearOneof(oneofDescriptor);
    }

    public ag_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ag_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ag_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ag_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ag_0 a(Message message) {
        if (message instanceof ae_0) {
            return this.a((ae_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ag_0 a(ae_0 ae_02) {
        if (ae_02 == ae_0.i()) {
            return this;
        }
        if (ae_02.b()) {
            this.a(ae_02.c());
        }
        if (!ae_02.g.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = ae_02.g;
                this.a &= 0xFFFFFFFD;
            } else {
                this.n();
                this.c.addAll(ae_02.g);
            }
            this.onChanged();
        }
        this.b(ae_0.b(ae_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.b();
    }

    public ag_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ae_0 ae_02 = null;
        try {
            ae_02 = (ae_0)ae_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ae_02 = (ae_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ae_02 != null) {
                this.a(ae_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public ay_0 c() {
        ay_0 ay_02 = ay_0.a(this.b);
        return ay_02 == null ? ay_0.a : ay_02;
    }

    public ag_0 a(ay_0 ay_02) {
        if (ay_02 == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = ay_02.getNumber();
        this.onChanged();
        return this;
    }

    public ag_0 k() {
        this.a &= 0xFFFFFFFE;
        this.b = 1;
        this.onChanged();
        return this;
    }

    private void n() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<Integer>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<Integer> d() {
        return Collections.unmodifiableList(this.c);
    }

    @Override
    public int e() {
        return this.c.size();
    }

    @Override
    public int a(int n) {
        return this.c.get(n);
    }

    public ag_0 a(int n, int n2) {
        this.n();
        this.c.set(n, n2);
        this.onChanged();
        return this;
    }

    public ag_0 b(int n) {
        this.n();
        this.c.add(n);
        this.onChanged();
        return this;
    }

    public ag_0 a(Iterable<? extends Integer> iterable) {
        this.n();
        AbstractMessageLite.Builder.addAll(iterable, this.c);
        this.onChanged();
        return this;
    }

    public ag_0 l() {
        this.c = Collections.emptyList();
        this.a &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final ag_0 a(UnknownFieldSet unknownFieldSet) {
        return (ag_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ag_0 b(UnknownFieldSet unknownFieldSet) {
        return (ag_0)super.mergeUnknownFields(unknownFieldSet);
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


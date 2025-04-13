/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from nI
 */
public final class ni_0
extends GeneratedMessageV3.Builder<ni_0>
implements nj_0 {
    private int a;
    private long b;
    private Object c = "";
    private Object d = "";
    private Object e = "";
    private int f;
    private long g;
    private List<no_0> h = Collections.emptyList();
    private RepeatedFieldBuilderV3<no_0, nq_0, nr_0> i;
    private List<nk_0> j = Collections.emptyList();
    private RepeatedFieldBuilderV3<nk_0, nm_0, nn_0> k;

    public static final Descriptors.Descriptor a() {
        return ne_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ne_0.b.ensureFieldAccessorsInitialized(ng_0.class, ni_0.class);
    }

    ni_0() {
        this.N();
    }

    ni_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.N();
    }

    private void N() {
        if (ng_0.C()) {
            this.P();
            this.R();
        }
    }

    public ni_0 w() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = "";
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = 0L;
        this.a &= 0xFFFFFFDF;
        if (this.i == null) {
            this.h = Collections.emptyList();
            this.a &= 0xFFFFFFBF;
        } else {
            this.i.clear();
        }
        if (this.k == null) {
            this.j = Collections.emptyList();
            this.a &= 0xFFFFFF7F;
        } else {
            this.k.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ne_0.a;
    }

    public ng_0 x() {
        return ng_0.z();
    }

    public ng_0 y() {
        ng_0 ng_02 = this.z();
        if (!ng_02.isInitialized()) {
            throw ni_0.newUninitializedMessageException((Message)ng_02);
        }
        return ng_02;
    }

    public ng_0 z() {
        ng_0 ng_02 = new ng_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ng_02.l = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ng_02.m = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ng_02.n = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        ng_02.o = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        ng_02.p = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        ng_02.q = this.g;
        if (this.i == null) {
            if ((this.a & 0x40) == 64) {
                this.h = Collections.unmodifiableList(this.h);
                this.a &= 0xFFFFFFBF;
            }
            ng_02.r = this.h;
        } else {
            ng_02.r = this.i.build();
        }
        if (this.k == null) {
            if ((this.a & 0x80) == 128) {
                this.j = Collections.unmodifiableList(this.j);
                this.a &= 0xFFFFFF7F;
            }
            ng_02.s = this.j;
        } else {
            ng_02.s = this.k.build();
        }
        ng_02.k = n2;
        this.onBuilt();
        return ng_02;
    }

    public ni_0 A() {
        return (ni_0)super.clone();
    }

    public ni_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ni_0)super.setField(fieldDescriptor, object);
    }

    public ni_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ni_0)super.clearField(fieldDescriptor);
    }

    public ni_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ni_0)super.clearOneof(oneofDescriptor);
    }

    public ni_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ni_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ni_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ni_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ni_0 a(Message message) {
        if (message instanceof ng_0) {
            return this.a((ng_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ni_0 a(ng_0 ng_02) {
        if (ng_02 == ng_0.z()) {
            return this;
        }
        if (ng_02.b()) {
            this.a(ng_02.c());
        }
        if (ng_02.d()) {
            this.a |= 2;
            this.c = ng_02.m;
            this.onChanged();
        }
        if (ng_02.g()) {
            this.a |= 4;
            this.d = ng_02.n;
            this.onChanged();
        }
        if (ng_02.j()) {
            this.a |= 8;
            this.e = ng_02.o;
            this.onChanged();
        }
        if (ng_02.m()) {
            this.e(ng_02.n());
        }
        if (ng_02.o()) {
            this.b(ng_02.p());
        }
        if (this.i == null) {
            if (!ng_02.r.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = ng_02.r;
                    this.a &= 0xFFFFFFBF;
                } else {
                    this.O();
                    this.h.addAll(ng_02.r);
                }
                this.onChanged();
            }
        } else if (!ng_02.r.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i.dispose();
                this.i = null;
                this.h = ng_02.r;
                this.a &= 0xFFFFFFBF;
                this.i = ng_0.D() ? this.P() : null;
            } else {
                this.i.addAllMessages(ng_02.r);
            }
        }
        if (this.k == null) {
            if (!ng_02.s.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = ng_02.s;
                    this.a &= 0xFFFFFF7F;
                } else {
                    this.Q();
                    this.j.addAll(ng_02.s);
                }
                this.onChanged();
            }
        } else if (!ng_02.s.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k.dispose();
                this.k = null;
                this.j = ng_02.s;
                this.a &= 0xFFFFFF7F;
                this.k = ng_0.E() ? this.R() : null;
            } else {
                this.k.addAllMessages(ng_02.s);
            }
        }
        this.b(ng_0.b(ng_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.g()) {
            return false;
        }
        if (!this.j()) {
            return false;
        }
        if (!this.m()) {
            return false;
        }
        if (!this.o()) {
            return false;
        }
        for (n = 0; n < this.s(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.v(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ni_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ng_0 ng_02 = null;
        try {
            ng_02 = (ng_0)ng_0.i.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ng_02 = (ng_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ng_02 != null) {
                this.a(ng_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public ni_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public ni_0 B() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ni_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public ni_0 C() {
        this.a &= 0xFFFFFFFD;
        this.c = ng_0.z().e();
        this.onChanged();
        return this;
    }

    public ni_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString i() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ni_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public ni_0 D() {
        this.a &= 0xFFFFFFFB;
        this.d = ng_0.z().h();
        this.onChanged();
        return this;
    }

    public ni_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public String k() {
        Object object = this.e;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.e = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString l() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ni_0 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = string;
        this.onChanged();
        return this;
    }

    public ni_0 E() {
        this.a &= 0xFFFFFFF7;
        this.e = ng_0.z().k();
        this.onChanged();
        return this;
    }

    public ni_0 c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean m() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int n() {
        return this.f;
    }

    public ni_0 e(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public ni_0 F() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean o() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public long p() {
        return this.g;
    }

    public ni_0 b(long l) {
        this.a |= 0x20;
        this.g = l;
        this.onChanged();
        return this;
    }

    public ni_0 G() {
        this.a &= 0xFFFFFFDF;
        this.g = 0L;
        this.onChanged();
        return this;
    }

    private void O() {
        if ((this.a & 0x40) != 64) {
            this.h = new ArrayList<no_0>(this.h);
            this.a |= 0x40;
        }
    }

    @Override
    public List<no_0> q() {
        if (this.i == null) {
            return Collections.unmodifiableList(this.h);
        }
        return this.i.getMessageList();
    }

    @Override
    public int s() {
        if (this.i == null) {
            return this.h.size();
        }
        return this.i.getCount();
    }

    @Override
    public no_0 a(int n) {
        if (this.i == null) {
            return this.h.get(n);
        }
        return (no_0)this.i.getMessage(n);
    }

    public ni_0 a(int n, no_0 no_02) {
        if (this.i == null) {
            if (no_02 == null) {
                throw new NullPointerException();
            }
            this.O();
            this.h.set(n, no_02);
            this.onChanged();
        } else {
            this.i.setMessage(n, (AbstractMessage)no_02);
        }
        return this;
    }

    public ni_0 a(int n, nq_0 nq_02) {
        if (this.i == null) {
            this.O();
            this.h.set(n, nq_02.k());
            this.onChanged();
        } else {
            this.i.setMessage(n, (AbstractMessage)nq_02.k());
        }
        return this;
    }

    public ni_0 a(no_0 no_02) {
        if (this.i == null) {
            if (no_02 == null) {
                throw new NullPointerException();
            }
            this.O();
            this.h.add(no_02);
            this.onChanged();
        } else {
            this.i.addMessage((AbstractMessage)no_02);
        }
        return this;
    }

    public ni_0 b(int n, no_0 no_02) {
        if (this.i == null) {
            if (no_02 == null) {
                throw new NullPointerException();
            }
            this.O();
            this.h.add(n, no_02);
            this.onChanged();
        } else {
            this.i.addMessage(n, (AbstractMessage)no_02);
        }
        return this;
    }

    public ni_0 a(nq_0 nq_02) {
        if (this.i == null) {
            this.O();
            this.h.add(nq_02.k());
            this.onChanged();
        } else {
            this.i.addMessage((AbstractMessage)nq_02.k());
        }
        return this;
    }

    public ni_0 b(int n, nq_0 nq_02) {
        if (this.i == null) {
            this.O();
            this.h.add(n, nq_02.k());
            this.onChanged();
        } else {
            this.i.addMessage(n, (AbstractMessage)nq_02.k());
        }
        return this;
    }

    public ni_0 a(Iterable<? extends no_0> iterable) {
        if (this.i == null) {
            this.O();
            AbstractMessageLite.Builder.addAll(iterable, this.h);
            this.onChanged();
        } else {
            this.i.addAllMessages(iterable);
        }
        return this;
    }

    public ni_0 H() {
        if (this.i == null) {
            this.h = Collections.emptyList();
            this.a &= 0xFFFFFFBF;
            this.onChanged();
        } else {
            this.i.clear();
        }
        return this;
    }

    public ni_0 f(int n) {
        if (this.i == null) {
            this.O();
            this.h.remove(n);
            this.onChanged();
        } else {
            this.i.remove(n);
        }
        return this;
    }

    public nq_0 g(int n) {
        return (nq_0)this.P().getBuilder(n);
    }

    @Override
    public nr_0 b(int n) {
        if (this.i == null) {
            return this.h.get(n);
        }
        return (nr_0)this.i.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends nr_0> r() {
        if (this.i != null) {
            return this.i.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.h);
    }

    public nq_0 I() {
        return (nq_0)this.P().addBuilder((AbstractMessage)no_0.l());
    }

    public nq_0 h(int n) {
        return (nq_0)this.P().addBuilder(n, (AbstractMessage)no_0.l());
    }

    public List<nq_0> J() {
        return this.P().getBuilderList();
    }

    private RepeatedFieldBuilderV3<no_0, nq_0, nr_0> P() {
        if (this.i == null) {
            this.i = new RepeatedFieldBuilderV3(this.h, (this.a & 0x40) == 64, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.h = null;
        }
        return this.i;
    }

    private void Q() {
        if ((this.a & 0x80) != 128) {
            this.j = new ArrayList<nk_0>(this.j);
            this.a |= 0x80;
        }
    }

    @Override
    public List<nk_0> t() {
        if (this.k == null) {
            return Collections.unmodifiableList(this.j);
        }
        return this.k.getMessageList();
    }

    @Override
    public int v() {
        if (this.k == null) {
            return this.j.size();
        }
        return this.k.getCount();
    }

    @Override
    public nk_0 c(int n) {
        if (this.k == null) {
            return this.j.get(n);
        }
        return (nk_0)this.k.getMessage(n);
    }

    public ni_0 a(int n, nk_0 nk_02) {
        if (this.k == null) {
            if (nk_02 == null) {
                throw new NullPointerException();
            }
            this.Q();
            this.j.set(n, nk_02);
            this.onChanged();
        } else {
            this.k.setMessage(n, (AbstractMessage)nk_02);
        }
        return this;
    }

    public ni_0 a(int n, nm_0 nm_02) {
        if (this.k == null) {
            this.Q();
            this.j.set(n, nm_02.o());
            this.onChanged();
        } else {
            this.k.setMessage(n, (AbstractMessage)nm_02.o());
        }
        return this;
    }

    public ni_0 a(nk_0 nk_02) {
        if (this.k == null) {
            if (nk_02 == null) {
                throw new NullPointerException();
            }
            this.Q();
            this.j.add(nk_02);
            this.onChanged();
        } else {
            this.k.addMessage((AbstractMessage)nk_02);
        }
        return this;
    }

    public ni_0 b(int n, nk_0 nk_02) {
        if (this.k == null) {
            if (nk_02 == null) {
                throw new NullPointerException();
            }
            this.Q();
            this.j.add(n, nk_02);
            this.onChanged();
        } else {
            this.k.addMessage(n, (AbstractMessage)nk_02);
        }
        return this;
    }

    public ni_0 a(nm_0 nm_02) {
        if (this.k == null) {
            this.Q();
            this.j.add(nm_02.o());
            this.onChanged();
        } else {
            this.k.addMessage((AbstractMessage)nm_02.o());
        }
        return this;
    }

    public ni_0 b(int n, nm_0 nm_02) {
        if (this.k == null) {
            this.Q();
            this.j.add(n, nm_02.o());
            this.onChanged();
        } else {
            this.k.addMessage(n, (AbstractMessage)nm_02.o());
        }
        return this;
    }

    public ni_0 b(Iterable<? extends nk_0> iterable) {
        if (this.k == null) {
            this.Q();
            AbstractMessageLite.Builder.addAll(iterable, this.j);
            this.onChanged();
        } else {
            this.k.addAllMessages(iterable);
        }
        return this;
    }

    public ni_0 K() {
        if (this.k == null) {
            this.j = Collections.emptyList();
            this.a &= 0xFFFFFF7F;
            this.onChanged();
        } else {
            this.k.clear();
        }
        return this;
    }

    public ni_0 i(int n) {
        if (this.k == null) {
            this.Q();
            this.j.remove(n);
            this.onChanged();
        } else {
            this.k.remove(n);
        }
        return this;
    }

    public nm_0 j(int n) {
        return (nm_0)this.R().getBuilder(n);
    }

    @Override
    public nn_0 d(int n) {
        if (this.k == null) {
            return this.j.get(n);
        }
        return (nn_0)this.k.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends nn_0> u() {
        if (this.k != null) {
            return this.k.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.j);
    }

    public nm_0 L() {
        return (nm_0)this.R().addBuilder((AbstractMessage)nk_0.p());
    }

    public nm_0 k(int n) {
        return (nm_0)this.R().addBuilder(n, (AbstractMessage)nk_0.p());
    }

    public List<nm_0> M() {
        return this.R().getBuilderList();
    }

    private RepeatedFieldBuilderV3<nk_0, nm_0, nn_0> R() {
        if (this.k == null) {
            this.k = new RepeatedFieldBuilderV3(this.j, (this.a & 0x80) == 128, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.j = null;
        }
        return this.k;
    }

    public final ni_0 a(UnknownFieldSet unknownFieldSet) {
        return (ni_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ni_0 b(UnknownFieldSet unknownFieldSet) {
        return (ni_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.w();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.A();
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
        return this.w();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.A();
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
        return this.A();
    }

    public /* synthetic */ Message buildPartial() {
        return this.z();
    }

    public /* synthetic */ Message build() {
        return this.y();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.w();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.A();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.z();
    }

    public /* synthetic */ MessageLite build() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.w();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.x();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.x();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.A();
    }

    public /* synthetic */ Object clone() {
        return this.A();
    }
}


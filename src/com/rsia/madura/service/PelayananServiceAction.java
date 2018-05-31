/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 09:58:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 13:51:53
*/

package com.rsia.madura.service;

// import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MRiwayatPeriksa;
import com.rsia.madura.entity.MPeriksaPasien;
import com.rsia.madura.entity.MDiagnosaPasien;
import com.rsia.madura.entity.MDiagnosa9;
import com.rsia.madura.entity.MTindakanPasien;
import com.rsia.madura.entity.MPakai;
import com.rsia.madura.entity.MResep;
import com.rsia.madura.entity.MPenunjangTrans;
import com.rsia.madura.entity.MSoap;

import com.rsia.madura.dao.PelayananDAO;
import com.rsia.madura.dao.RiwayatPeriksaDAO;
import com.rsia.madura.dao.PeriksaPasienDAO;
import com.rsia.madura.dao.DiagnosaPasienDAO;
import com.rsia.madura.dao.Diagnosa9DAO;
import com.rsia.madura.dao.TindakanPasienDAO;
import com.rsia.madura.dao.PakaiDAO;
import com.rsia.madura.dao.ResepDAO;
import com.rsia.madura.dao.PenunjangTransDAO;
import com.rsia.madura.dao.SoapDAO;

@Service
public class PelayananServiceAction implements PelayananService{
	@Autowired
	private PelayananDAO pelayananDAO;

	@Autowired
	private RiwayatPeriksaDAO riwayatPeriksaDAO;

	@Override
	@Transactional
	public List<MPendaftaran> getPelayanans() {
		// TODO Auto-generated method stub
		return pelayananDAO.getPelayanans();
	}

	@Override
	@Transactional
	public List<MPendaftaran> getPelayanans(int page, int limit) {
		// TODO Auto-generated method stub
		return pelayananDAO.getPelayanans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return pelayananDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPendaftaran getPelayanan(int id) {
		// TODO Auto-generated method stub
		return pelayananDAO.getPelayanan(id);
	}

	@Override
	@Transactional
	public void update(MPendaftaran data) {
		// TODO Auto-generated method stub
		if (data.getRiwayatperiksa() != null) {
			data.getRiwayatperiksa().forEach((riwayatperiksa) -> {
				riwayatperiksa.setPendaftaran(data);
			});
		}

		if (data.getPeriksapasien() != null) {
			data.getPeriksapasien().forEach((periksapasien) -> {
				periksapasien.setPendaftaran(data);
			});
		}

		if (data.getDiagnosapasien() != null) {
			data.getDiagnosapasien().forEach((diagnosapasien) -> {
				diagnosapasien.setPendaftaran(data);
			});
		}

		if (data.getTindakanpasien() != null) {
			data.getTindakanpasien().forEach((tindakanpasien) -> {
				tindakanpasien.setPendaftaran(data);
			});
		}

		if (data.getDiagnosa9() != null) {
			data.getDiagnosa9().forEach((diagnosa9) -> {
				diagnosa9.setPendaftaran(data);
			});
		}

		if (data.getPakai() != null) {
			data.getPakai().forEach((pakai) -> {
				pakai.setPendaftaran(data);
			});
		}

		if (data.getResep() != null) {
			data.getResep().forEach((resep) -> {
				resep.setPendaftaran(data);
			});
		}

		if (data.getPenunjangtrans() != null) {
			data.getPenunjangtrans().forEach((penunjangtrans) -> {
				penunjangtrans.setPendaftaran(data);
			});
		}

		if (data.getSoap() != null) {
			data.getSoap().forEach((soap) -> {
				soap.setPendaftaran(data);
			});
		}
		
        List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List<MRiwayatPeriksa> delRiwayat = manageRiwayatPeriksa(data);
        // List   xxxxxxxxxx

		pelayananDAO.update(data);

		// ini conto pertama
		delRiwayat.forEach((riwayatperiksa) -> {
			if (riwayatperiksa.getPeriksaID() != null) {
				riwayatPeriksaDAO.RiwayatPeriksaDelete(riwayatperiksa);
			}	
		});
		// lanjutakan kedua
		// delRiwayat.forEach((riwayatperiksa) -> {
		// 	if (riwayatperiksa.getPeriksaID() != null) {
		// 		riwayatPeriksaDAO.RiwayatPeriksaDelete(riwayatperiksa);
		// 	}	
		// });
		// delRiwayat.forEach((riwayatperiksa) -> {
		// 	if (riwayatperiksa.getPeriksaID() != null) {
		// 		riwayatPeriksaDAO.RiwayatPeriksaDelete(riwayatperiksa);
		// 	}	
		// });
		// delRiwayat.forEach((riwayatperiksa) -> {
		// 	if (riwayatperiksa.getPeriksaID() != null) {
		// 		riwayatPeriksaDAO.RiwayatPeriksaDelete(riwayatperiksa);
		// 	}	
		// });


	}

	@Override
	@Transactional
	public void delete(MPendaftaran data) {
		// TODO Auto-generated method stub
		pelayananDAO.delete(data);
	}

	private List<MRiwayatPeriksa> manageRiwayatPeriksa(MPendaftaran pendaftaran) {
        // Store the riwayatperiksas which shouldn't be persisted
        List<MRiwayatPeriksa> delRiwayat = new ArrayList<MRiwayatPeriksa>();
        if (pendaftaran.getRiwayatperiksa() != null) {
            for (Iterator<MRiwayatPeriksa> i = pendaftaran.getRiwayatperiksa().iterator(); i.hasNext();) {
                MRiwayatPeriksa riwayatperiksa = i.next();
                if ( riwayatperiksa.getRemove() != null ) {
                	// delete: 
                    delRiwayat.add(riwayatperiksa);
                    i.remove();
                } else {
                	// create || update 
                    riwayatperiksa.setPendaftaran(pendaftaran);
                }
            }
        }
        return delRiwayat;
    }

	private List<MPeriksaPasien> managePeriksaPasien(MPendaftaran pendaftaran) {
        List<MPeriksaPasien> delPeriksa = new ArrayList<MPeriksaPasien>();
        if (pendaftaran.getPeriksapasien() != null) {
            for (Iterator<MPeriksaPasien> i = pendaftaran.getPeriksapasien().iterator(); i.hasNext();) {
                MPeriksaPasien periksapasien = i.next();
                if ( periksapasien.getRemove() != null ) {
                	// delete: 
                    delPeriksa.add(periksapasien);
                    i.remove();
                } else {
                	// create || update 
                    periksapasien.setPendaftaran(pendaftaran);
                }
            }
        }
        return delPeriksa;
    }

	private List<MDiagnosaPasien> manageDiagnosaPasien(MPendaftaran pendaftaran) {
        List<MDiagnosaPasien> delDiagnosaPasien = new ArrayList<MDiagnosaPasien>();
        if (pendaftaran.getDiagnosapasien() != null) {
            for (Iterator<MDiagnosaPasien> i = pendaftaran.getDiagnosapasien().iterator(); i.hasNext();) {
                MDiagnosaPasien diagnosapasien = i.next();
                if ( diagnosapasien.getRemove() != null ) {
                	// delete: 
                    delDiagnosaPasien.add(diagnosapasien);
                    i.remove();
                } else {
                	// create || update 
                    diagnosapasien.setPendaftaran(pendaftaran);
                }
            }
        }
        return delDiagnosaPasien;
    }

	private List<MTindakanPasien> manageTindakanPasien(MPendaftaran pendaftaran) {
        List<MTindakanPasien> delTindakanPasien = new ArrayList<MTindakanPasien>();
        if (pendaftaran.getTindakanpasien() != null) {
            for (Iterator<MTindakanPasien> i = pendaftaran.getTindakanpasien().iterator(); i.hasNext();) {
                MTindakanPasien tindakanpasien = i.next();
                if ( tindakanpasien.getRemove() != null ) {
                	// delete: 
                    delTindakanPasien.add(tindakanpasien);
                    i.remove();
                } else {
                	// create || update 
                    tindakanpasien.setPendaftaran(pendaftaran);
                }
            }
        }
        return delTindakanPasien;
    }

    private List<MDiagnosa9> manageDiagnosa9(MPendaftaran pendaftaran) {
        List<MDiagnosa9> delDiagnosa9 = new ArrayList<MDiagnosa9>();
        if (pendaftaran.getDiagnosa9() != null) {
            for (Iterator<MDiagnosa9> i = pendaftaran.getDiagnosa9().iterator(); i.hasNext();) {
                MDiagnosa9 diagnosa9 = i.next();
                if ( diagnosa9.getRemove() != null ) {
                	// delete: 
                    delDiagnosa9.add(diagnosa9);
                    i.remove();
                } else {
                	// create || update 
                    diagnosa9.setPendaftaran(pendaftaran);
                }
            }
        }
        return delDiagnosa9;
    }

    private List<MPakai> managePakai(MPendaftaran pendaftaran) {
        List<MPakai> delPakai = new ArrayList<MPakai>();
        if (pendaftaran.getPakai() != null) {
            for (Iterator<MPakai> i = pendaftaran.getPakai().iterator(); i.hasNext();) {
                MPakai pakai = i.next();
                if ( pakai.getRemove() != null ) {
                	// delete: 
                    delPakai.add(pakai);
                    i.remove();
                } else {
                	// create || update 
                    pakai.setPendaftaran(pendaftaran);
                }
            }
        }
        return delPakai;
    }

    private List<MResep> manageResep(MPendaftaran pendaftaran) {
        List<MResep> delResep = new ArrayList<MResep>();
        if (pendaftaran.getResep() != null) {
            for (Iterator<MResep> i = pendaftaran.getResep().iterator(); i.hasNext();) {
                MResep resep = i.next();
                if ( resep.getRemove() != null ) {
                	// delete: 
                    delResep.add(resep);
                    i.remove();
                } else {
                	// create || update 
                    resep.setPendaftaran(pendaftaran);
                }
            }
        }
        return delResep;
    }

    private List<MPenunjangTrans> managePenunjangTrans(MPendaftaran pendaftaran) {
        List<MPenunjangTrans> delPenunjangTrans = new ArrayList<MPenunjangTrans>();
        if (pendaftaran.getPenunjangtrans() != null) {
            for (Iterator<MPenunjangTrans> i = pendaftaran.getPenunjangtrans().iterator(); i.hasNext();) {
                MPenunjangTrans penunjangtrans = i.next();
                if ( penunjangtrans.getRemove() != null ) {
                	// delete: 
                    delPenunjangTrans.add(penunjangtrans);
                    i.remove();
                } else {
                	// create || update 
                    penunjangtrans.setPendaftaran(pendaftaran);
                }
            }
        }
        return delPenunjangTrans;
    }

    private List<MSoap> manageSoap(MPendaftaran pendaftaran) {
        List<MSoap> delSoap = new ArrayList<MSoap>();
        if (pendaftaran.getSoap() != null) {
            for (Iterator<MSoap> i = pendaftaran.getSoap().iterator(); i.hasNext();) {
                MSoap soap = i.next();
                if ( soap.getRemove() != null ) {
                	// delete: 
                    delSoap.add(soap);
                    i.remove();
                } else {
                	// create || update 
                    soap.setPendaftaran(pendaftaran);
                }
            }
        }
        return delSoap;
    }
}
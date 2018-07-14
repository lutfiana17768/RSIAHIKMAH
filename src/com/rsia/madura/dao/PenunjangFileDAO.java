package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPenunjangFile;

public interface PenunjangFileDAO {
	public List<MPenunjangFile> getPenunjangFiles();
	public List<MPenunjangFile> getPenunjangFiles(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjangFile getPenunjangFile(int PenunjangFileId);
	
	public void PenunjangFileStore(MPenunjangFile PenunjangFileModel);
	public void PenunjangFileUpdate(MPenunjangFile PenunjangFileModel);
	public void PenunjangFileDelete(MPenunjangFile PenunjangFileModel);
}

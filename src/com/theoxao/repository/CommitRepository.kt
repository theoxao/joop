package com.theoxao.repository

import com.theoxao.config.MongoApplication
import com.theoxao.model.Commit

class CommitRepository(mongoApplication: MongoApplication) : BaseRepository<Commit>(mongoApplication) {

    override var collection: String = "commits"

}
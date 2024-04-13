package com.skybory.seoulArt.domain.reply;

import java.time.LocalDateTime;

import com.skybory.seoulArt.domain.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(
		name="REPLY_SEQ_GENERATOR",
		sequenceName = "REPLY,SEQ",
		initialValue = 1, allocationSize = 1
		)
public class Reply {
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "REPLY_SEQ_GENERATOR"
			)
	private Long replyIdx;
	
	@ManyToOne
	private User user;
	
	private String replyCommemt;
	
	private LocalDateTime replyDateTime;
	
}
